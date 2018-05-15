package lab8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PetArray {
    private static Pet inputDataBuffer(Pet Cat) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Please enter  your information: ");
            System.out.print("Name: ");
            Cat.setName(reader.readLine());
            System.out.print("Age: ");
            Cat.setAge(Integer.parseInt(reader.readLine()));
            private static Pet inputDataBuffer(Pet Dog) throws IOException {
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                    System.out.println("Please enter  your information: ");
                    System.out.print("Name: ");
                    Cat.setName(reader.readLine());
                    System.out.print("Age: ");
                    Cat.setAge(Integer.parseInt(reader.readLine()));
        }

        return Dog;
}
