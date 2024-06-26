package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;

import seedu.address.model.Model;

/**
 * Deletes all entries in the patient list.
 */
public class DeleteAllCommand extends Command {

    public static final String COMMAND_WORD = "delete-all";
    public static final String CONFIRMATION =
            "Are you sure you want to delete all?"
                    + "\nThis action is irreversible."
                    + "\nIf yes, enter ‘yes’. If not, simply enter 'no'.";

    /**
     * Executes the command and returns the result message.
     *
     * @param model {@code Model} which the command should operate on.
     * @return feedback message of the operation result for display
     */
    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        return new CommandResult(CONFIRMATION);
    }
}
