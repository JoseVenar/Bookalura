package com.alura.bookalura1.services;

public interface IConvierteDatos
{
    <T> T obtenerDatos(String json, Class<T> tClass);
}
