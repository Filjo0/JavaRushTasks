package com.javarush.task.task20.task2002;

import java.io.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {


        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User user = new User();
            user.setFirstName("Rubi");
            user.setLastName("Rail");
            user.setBirthDate(new Date(1508944516168L));
            user.setMale(true);
            user.setCountry(User.Country.OTHER);

            User user1 = new User();
            user1.setFirstName("Vasa1");
            user1.setLastName("Peta1");
            user1.setBirthDate(new Date(1508944516163L));
            user1.setMale(true);
            user1.setCountry(User.Country.RUSSIA);

            User user3 = new User();
            user3.setFirstName("Solo");
            user3.setLastName("Han");
            user3.setBirthDate(new Date(1508944516169L));
            user3.setMale(true);
            user3.setCountry(User.Country.UKRAINE);


            javaRush.users.add(user);
            javaRush.users.add(user1);
            javaRush.users.add(user3);
            javaRush.save(outputStream);

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the codeGym object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны

            outputStream.close();
            inputStream.close();

            System.out.println(javaRush.equals(loadedObject));

            for (User us : javaRush.users) {
                System.out.println(us.toString());
            }


        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter printWriter = new PrintWriter(outputStream);
            if (users.size() > 0) {

                for (User user : users) {

                    if (user.getFirstName() != null) {
                        printWriter.println(user.getFirstName());
                    }
                    if (user.getLastName() != null) {
                        printWriter.println(user.getLastName());
                    }
                    if (user.getBirthDate() != null) {
                        printWriter.println(user.getBirthDate().getTime());
                    }
                    if (user.getCountry() != null) {
                        printWriter.println(user.getCountry().getDisplayName());
                    }
                    printWriter.println(user.isMale());
                }
                printWriter.flush();

            }
            //implement this method - реализуйте этот метод
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            if (users != null) {
                while (reader.ready()) {

                    User user = new User();
                    user.setFirstName(reader.readLine());
                    user.setLastName(reader.readLine());
                    user.setBirthDate(new Date(Long.parseLong(reader.readLine())));

                    String str = reader.readLine();
                    if (str.equals("Ukraine")) {
                        user.setCountry(User.Country.UKRAINE);
                    }
                    if (str.equals("Russia")) {
                        user.setCountry(User.Country.RUSSIA);
                    }
                    if (str.equals("Other")) {
                        user.setCountry(User.Country.OTHER);
                    }
                    user.setMale(Boolean.parseBoolean(reader.readLine()));
                    users.add(user);
                }

                reader.close();
            }

        } //implement this method - реализуйте этот метод

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return Objects.equals(users, javaRush.users);

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
