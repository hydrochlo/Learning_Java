package com.shahadat.exceptionHandling;

public class Main {
    static void main(String[] args) {
        int a = 5;
        int b = 0;
        try{
//            divide(a, b);
            // mimicking

//            throw new Exception("Just for fun");
            String name = "Shahadat";
            if(name.equals("Shahadat")){
                throw new MyException("Name is Shahadat");
            }
        } catch (MyException e){
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e){ // More string exception should add first.
            System.out.println("Arithmatic exception");
        }
        catch (Exception e){
            System.out.println("Normal exception");
        }
        finally {
            System.out.println("This will always execute.");
        }
    }

    static int divide(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("Do not divide by zero.");
        }
        return a / b;
    }
}
