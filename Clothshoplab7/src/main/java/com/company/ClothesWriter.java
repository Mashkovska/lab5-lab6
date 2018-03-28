package com.company;


import java.io.*;
import java.util.List;

public class ClothesWriter {
    private Writer writer;
    public void writeToFile(final List<Clothes> Clothes) {
        try{
            File file = new File("C:\\Users\\user\\eclipse-workspace\\Clothshoplab5\\Clothes.csv");
            if (!file.exists()){
                file.createNewFile();
            }
            OutputStream stream = new FileOutputStream(file);
            writer = new PrintWriter(stream);
            for (Clothes clothes: Clothes) {
                writer.write(clothes.getHeaders()+"\n\r");
                writer.write(clothes.toCSV()+"\n\r");
                writer.write("\n");
            }
            writer.close();
        }
        catch (IOException e) {
            e.getStackTrace();
        }
    }

}
