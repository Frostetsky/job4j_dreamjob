package store;

import model.Candidate;
import model.Post;

public class PsqlMain {

    private static final Store store = PsqlStore.instOf();

    public static void main(String[] args) {
        store.savePost(new Post(0, "C++ Job"));
        store.savePost(new Post(0, "IOS Developer"));
        for (Post post : store.findAllPosts()) {
            System.out.println(post.getId() + " " + post.getName());
        }

        store.saveCandidate(new Candidate(0, "Java Developer"));
        store.saveCandidate(new Candidate(0, "Java Developer"));
        for (Candidate candidate : store.findAllCandidates()) {
            System.out.println(candidate.getId() + " " + candidate.getName());
        }

        store.savePost(new Post(2, "PHP Job"));
        for (Post post : store.findAllPosts()) {
            System.out.println(post.getId() + " " + post.getName());
        }

        store.saveCandidate(new Candidate(2, "JavaScript Developer"));
        for (Candidate candidate : store.findAllCandidates()) {
            System.out.println(candidate.getId() + " " + candidate.getName());
        }

        Post post = store.findByIdPost(1);
        System.out.println(post.getId() + " " + post.getName());

        Candidate candidate = store.findByIdCandidate(1);
        System.out.println(candidate.getId() + " " + candidate.getName());
    }
}
