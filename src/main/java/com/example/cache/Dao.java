package com.example.cache;

import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.io.File;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@Component
public class Dao {
    @SneakyThrows
    public String getData(){
        Thread.sleep( 2000);
        List<String> strings =  Files.readAllLines(Path.of("text.txt"));
        return String.join(" ", strings);
    }
}
