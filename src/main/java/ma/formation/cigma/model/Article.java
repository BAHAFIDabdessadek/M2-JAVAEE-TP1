package ma.formation.cigma.model;

import lombok.*;

@Data
/*
 DATA => GETTER + SETTER + TOSTRING + HASHCODE
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Article {

    private Integer id ;
    private String description;
    private Double price;
    private Double quantity;


}
