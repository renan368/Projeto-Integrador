
package unisales.br.ConsultMedica.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Email
    private String email;
    
    @Size(min = 3, max = 30, message = "digite entre 3 a 30 caracteeres")
    private String user;
    
    private String senha;
}
