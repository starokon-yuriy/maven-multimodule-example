package com.epam.rd.maven_multimodule_example.echo.services;

public class SystemOutEchoService implements EchoService {

    @Override
    public void echo(String str) {
        System.out.println(str);
    }
}
