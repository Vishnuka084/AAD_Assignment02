package lk.ijse.gdse.spring.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class TechLeadDTO {
    private String id;
    private String name;
    private String address;
    private String mail;
}
