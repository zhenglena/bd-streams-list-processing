import listprocessing.ProjectServerManager;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileProcessor {

    private ProjectServerManager serverManager;

    /**
     * Constructor for FileProcessor.
     */
    public FileProcessor() {
        serverManager = new ProjectServerManager();
    }

    /**
     * Returns a {@code `List<String>`} that contains only the file names for .txt or .md files, all lowercase and
     * sorted alphabetically.
     * PARTICIPANTS: Complete this method.
     * @param source Source list.
     * @return Processed list.
     */
    public List<String> filterDocs(List<String> source) {
        return source.stream()
                .filter(docs -> docs.contains(".txt") || docs.contains(".md"))
                .map(String::toLowerCase)
                .sorted()
                .collect(Collectors.toList());

    }

    /**
     * Returns a {@code `Set<String>`} that contains only the file names for .java files, with each file capitalized.
     * PARTICIPANTS: Complete this method.
     * @param source Source List.
     * @return Processed Set.
     */
    public Set<String> filterJava(List<String> source) {
        return source.stream()
                .filter(docs -> docs.contains(".java"))
                .map(StringUtils::capitalize)
                .collect(Collectors.toSet());
    }

    /**
     * Sorts all file names in the list, and submits them in order to the project server via the method
     * `submitToProject()` of the `listprocessing.ProjectServerManager` class.
     * PARTICIPANTS: Complete this method.
     * @param source Source list.
     */
    public void sortAndSubmitAll(List<String> source) {
        List<String> sortedSource = source.stream()
                .sorted()
                .collect(Collectors.toList());
        for (String file : sortedSource) {
            serverManager.submitToProject(file);
        }
    }
}
