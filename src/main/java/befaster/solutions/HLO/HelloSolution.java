package befaster.solutions.HLO;

public class HelloSolution {
    public String hello(final String friendName) {
        String name = friendName;

        if (null == name) {
            name = "World";
        } else {
            name = name.trim();
        }

        return "Hello, " + name + "!";
    }
}
