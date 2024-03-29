package vsg.veera.bankingapp.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccountData {

    private Long Id;

    private String Name;

    private double Balance;
}
