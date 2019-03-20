package com.epam.rd.maven_multimodule_example.echo.console;

import com.epam.rd.maven_multimodule_example.echo.services.EchoService;
import com.epam.rd.maven_multimodule_example.echo.services.SystemOutEchoService;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        if (args.length > 0) {
            EchoService echoService = new SystemOutEchoService();
            echoService.echo(Arrays.toString(args));
        } else {
            System.err.println("Invalid input data: String[] args is empty!");
        }
    }
}
