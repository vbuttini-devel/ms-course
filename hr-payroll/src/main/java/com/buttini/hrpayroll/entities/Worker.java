package com.buttini.hrpayroll.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Vinicius Buttini
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Worker implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private Double dailyIncome;
}
