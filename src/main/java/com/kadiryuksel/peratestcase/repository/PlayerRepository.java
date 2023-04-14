package com.kadiryuksel.peratestcase.repository;

import com.kadiryuksel.peratestcase.entity.Player;
import com.kadiryuksel.peratestcase.enums.Nationality;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, Long> {

    List<Player> getPlayersByTeamId(long teamId);

    int countByNationalityAndTeamId(Nationality nationality, long teamId);

    void deleteAllByTeamId(long teamId);

    boolean existsByFirstNameAndLastName(String firstName, String lastName);

    Player getPlayerByFirstNameAndLastName(String firstName, String lastName);
}