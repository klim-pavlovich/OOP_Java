package ru.geekbrains.seminar6.isp;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<PhonePayable> paymentServices = new ArrayList<>();
        paymentServices.add(new InternetPaymentSerivce());
//        paymentServices.add(new CustomPaymentSerivce());

        for (PhonePayable paymentService: paymentServices){
            paymentService.payPhoneNumber(2000);
            break;
        }


    }
}
