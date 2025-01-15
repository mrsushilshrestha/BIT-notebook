import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VotingSystem {
    private final List<Candidate> candidates;
    private final Scanner scanner;

    public VotingSystem() {
        candidates = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addCandidate(Candidate candidate) {
        candidates.add(candidate);
    }

    public void startVoting() {
        while (true) {
            System.out.println("Enter the number of the candidate you want to vote for or type 'exit' to quit:");
            String input = scanner.nextLine();

            if ("exit".equalsIgnoreCase(input)) {
                break;
            }

            int voterChoice = Integer.parseInt(input);

            if (voterChoice > 0 && voterChoice <= candidates.size()) {
                candidates.get(voterChoice - 1).addVote();
            } else {
                System.out.println("Invalid selection. Please try again.");
            }
        }
    }

    public void printResults() {
        System.out.println("Election results:");

        for (int i = 0; i < candidates.size(); i++) {
            Candidate candidate = candidates.get(i);
            System.out.printf("%d. %s: %d votes\n", i + 1, candidate.getName(), candidate.getVotes());
        }
    }

    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        // Add candidates
        votingSystem.addCandidate(new Candidate("Candidate A"));
        votingSystem.addCandidate(new Candidate("Candidate B"));
        votingSystem.addCandidate(new Candidate("Candidate C"));

        // Start voting
        votingSystem.startVoting();

        // Print results
        votingSystem.printResults();
    }
}