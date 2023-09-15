package com.scaler.bookmyshow.Models;

import com.scaler.bookmyshow.Enums.PaymentStatus;
import com.scaler.bookmyshow.Enums.ProviderMethodType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class Payment extends BaseModel {

    private double amount;
    private String reference;

    @Enumerated
    private ProviderMethodType providertype;

    @Enumerated
    private PaymentStatus status;



}