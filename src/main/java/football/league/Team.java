package football.league;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Przechowuje listę zawodników (załóżmy sobie, że imię i nazwisko zawodnika jest unikalne),
 * ma nazwę.
 */

@Getter
@Setter
@AllArgsConstructor
class Team {

    private final int id;
    private List<String> players;
    private String name;


}