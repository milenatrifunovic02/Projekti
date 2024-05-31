package com.asss.pj.util;

import com.asss.pj.service.BrodService;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

@EnableAspectJAutoProxy
@Aspect
@Component
public class Logger {

    @Autowired
    private BrodService brodService;

    @Pointcut("execution(* com.asss.pj.controller.BrodRestController.findAllPutnicki(..))")
    public void getPutnicki(){

    }

    @Pointcut("execution(* com.asss.pj.controller.BrodRestController.findAllGorivo(..))")
    public void getGorivo(){

    }

    @Pointcut("execution(* com.asss.pj.controller.BrodRestController.addBrod(..))")
    public void postMethod(){

    }

    @Pointcut("execution(* com.asss.pj.controller.BrodRestController.editBrod(..))")
    public void putMethod(){

    }

    @Pointcut("execution(* com.asss.pj.controller.BrodRestController.removeBrod(..))")
    public void deleteMethod(){

    }

    @AfterReturning("getPutnicki()")
    public void gpMethod() {
        try (FileWriter fileWriter = new FileWriter(LoggerHelper.getFileName(), true)) {
            fileWriter.write("[" + LocalDate.now() + "]" + " [" + LocalTime.now().truncatedTo(ChronoUnit.SECONDS) + "]" + "---Log: GET metoda koriscena" + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @AfterReturning("getGorivo()")
    public void ggMethod() {
        try (FileWriter fileWriter = new FileWriter(LoggerHelper.getFileName(), true)) {
            fileWriter.write("[" + LocalDate.now() + "]" + " [" + LocalTime.now().truncatedTo(ChronoUnit.SECONDS) + "]" + "---Log: GET po ceni sortirani" + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @AfterReturning("postMethod()")
    public void poMethod() {
        try (FileWriter fileWriter = new FileWriter(LoggerHelper.getFileName(), true)) {
            fileWriter.write("[" + LocalDate.now() + "]" + " [" + LocalTime.now().truncatedTo(ChronoUnit.SECONDS) + "]" + "---Log: PUT metoda koriscena" + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @AfterReturning("putMethod()")
    public void puMethod() {
        try (FileWriter fileWriter = new FileWriter(LoggerHelper.getFileName(), true)) {
            fileWriter.write("[" + LocalDate.now() + "]" + " [" + LocalTime.now().truncatedTo(ChronoUnit.SECONDS) + "]" + "---Log: PUT metoda koriscena" + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @AfterReturning("deleteMethod()")
    public void delMethod() {
        try (FileWriter fileWriter = new FileWriter(LoggerHelper.getFileName(), true)) {
            fileWriter.write("[" + LocalDate.now() + "]" + " [" + LocalTime.now().truncatedTo(ChronoUnit.SECONDS) + "]" + "---Log: DELETE metoda koriscena" + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
