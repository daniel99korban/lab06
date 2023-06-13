package ifma.lpweb.lab06.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_jogador")
public class Jogador {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idJogador;
    private String nome;
    private LocalDate nascimento;
    private String genero;
    private double altura;
    @ManyToOne
    private Time time;

}
