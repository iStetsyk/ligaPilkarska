package football.league;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class LeagueManager {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


       while (true) {

       }
    }

    private static void createTeam() {

//        List<String> teams = Stream.of("lions").collect(Collectors.toList());
    }

    private static void createMatch() {
        List<String> matches = Stream.of("firstMatch").collect(Collectors.toList());
    }

    private static void createLiga() {
        List<String> ligs = Stream.of("A1").collect(Collectors.toList());

    }
}

















/**
    Team one = new Team(1, emptyList(), "on\"e");
    Team two = new Team(2, emptyList(), "two");
    Team three = new Team(3, emptyList(), "three");
    Team four = Team.builder()
            .id(4)
            .name("four")
            .players(emptyList())
            .build();

    List<Team> teams = Arrays.asList(one, two, three, four);

    List<Match> matches = Arrays.asList(
            new Match(1, one, two, "1:2"),
            new Match(2, one, two, "1:3"),
            new Match(3, one, three, "2:3"),
            new Match(4, two, three, "4:3"),
            new Match(5, two, one, "1:3"),
            new Match(6, one, two, "1:4")
    );

        FileManager.dumpTeamsToFile(teams);
                FileManager.dumpMatchesToFile(matches);

                List<Team> restoredTeams = FileManager.readTeamsFromFile();

        Map<Integer, Team> teamsById = restoredTeams.stream()
        .collect(Collectors.toMap(Team::getId, Function.identity()));

        List<Match> restoredMatches = FileManager.readMatchesFromFile(teamsById);

        restoredMatches.forEach(System.out::println);
 */