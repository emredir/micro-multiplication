package microservices.book.multiplication.service;

import microservices.book.multiplication.domain.Multiplication;
import microservices.book.multiplication.domain.MultiplicationResultAttempt;

import java.util.List;
import java.util.Optional;

public interface MultiplicationService {

    /**
     * Creates a {@link Multiplication} object with two randomly-generated factors.
     *
     * @return a Multiplication object with random factors
     */
    Multiplication createRandomMultiplication();

    /**
     * @return true if the attempt matches the result of the multiplication, false otherwise.
     */
    boolean checkAttempt(final MultiplicationResultAttempt resultAttempt);

    /**
     * Gets the statistics for a given user.
     *
     * @param userAlias the user's alias
     * @return a list of {@link MultiplicationResultAttempt} objects, being the past attempts of the user.
     */
    List<MultiplicationResultAttempt> getStatsForUser(final String userAlias);

    /**
     * Gets {@link MultiplicationResultAttempt} object for given id.
     *
     * @return MultiplicationResultAttempt
     */
    MultiplicationResultAttempt getResultById(final Long resultId);

}