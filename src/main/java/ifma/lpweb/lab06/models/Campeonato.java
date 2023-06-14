package ifma.lpweb.lab06.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_campeonato")
public class Campeonato implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idCampeonato;
    @NotNull
    private int ano;
    @NotNull
    private String nome;
    @OneToMany(mappedBy = "campeonato")
    private List<Partida> partidas;
}
