package com.sisterag.robguterdash.util;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileReader;
import java.io.IOException;

public class funciones {

    public static JsonObject leerJson(String rutaArchivo) throws IOException {
        try (FileReader reader = new FileReader(rutaArchivo)) {
            return JsonParser.parseReader(reader).getAsJsonObject();
        }
    }
}
