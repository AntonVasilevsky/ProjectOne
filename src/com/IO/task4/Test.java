package com.IO.task4;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Test {
    public static void main(String[] args) {
        Path sourceDirectory = Path.of("e:\\dir1");
        String s = "e:\\dir2";
        Path targetDirectory = Path.of(s);
        System.out.println(targetDirectory.getRoot()+""+targetDirectory.getFileName());
        //targetDirectory.resolve()


      try(DirectoryStream<Path> directoryStream = Files.newDirectoryStream(sourceDirectory)){
          for (Path p: directoryStream
               ) {

             Files.copy(p, Path.of(targetDirectory.getRoot()+""+targetDirectory.getFileName()
                     +"\\"+ p.getFileName()), StandardCopyOption.REPLACE_EXISTING);

          }
      } catch (IOException e) {
          throw new RuntimeException(e);
      }
        System.out.println(Files.isDirectory(sourceDirectory));
    }
}
