public enum PropertyType {
    
    TECHNOLOGY("Department of Technology"), JUSTICE("Department of Justice"), PROPAGANDA("Program for Propaganda"),
    ALCHEMY("Agency of Alchemy"), AGRICULTURE("Committee on Agriculture"), DARK_ARTS("Dark Arts Committee"), 
    HOUSING("Department of Housing and Urban Development"), TRANSPORTATION("Department of Transportation"),
    VOLUNTEERISM("Task-Force for Volunteerism"), EDUCATION("Educational Counsel"), DIPLOMACY("Department of Diplomacy"),
    WAR("Ministry of War"), POLICE("Secret Police");
    private final String myName;

    PropertyType(String name) {
        myName = name;
    }

    public String getName() {
        return myName;
    }
}
