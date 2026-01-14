package ch.berufsbildung.vs.generators;

import java.util.Random;

public class ClassroomNameGenerator {
    private final String[] classroomNames = {"Tech Lab", "Innovation Hub", "Digital Den", "Code Commandos", "Future Workshop",
            "Cyber Space", "Gadget Garage", "Data Zone", "STEM Lab", "The Robotics Room", "Programming Paradise", "AI Arena",
            "Web Development Workshop", "Virtual Reality Vault", "Network Nook", "Software Solutions Studio", "Cloud Computing Classroom",
            "Cybersecurity Center", "Data Science Den", "Game Development Garage", "IT Incubator", "Tech Titans Room",
            "Electronics Emporium", "Mobile App Academy", "3D Printing Studio", "Blockchain Basement", "Digital Design Den",
            "Smart Tech Studio", "E-Sports Arena", "Tech Explorers Room", "Gamer's Guild", "Robotics Research Room",
            "Creative Coding Corner", "Tech Talk Theater", "Artificial Intelligence Academy", "IoT Innovation Lab",
            "Virtual Learning Lounge", "Tech Trends Training Room", "Data Visualization Vault", "Digital Marketing Hub",
            "Software Development Suite", "Tech Savvy Space", "Cyber Labyrinth", "Engineering Excellence Room", "Digital Media Studio",
            "Tech Discovery Dome", "Information Systems Studio", "Future Tech Forum", "Coding Cove", "Tech Workshop Wonderland",
            "Virtual Collaboration Center", "Augmented Reality Arena", "IT Strategy Suite", "Digital Literacy Lab", "Algorithm Alley",
            "Tech Pioneers Place", "Programming Playground", "Robotics Revolution Room", "Data Analytics Arena", "Smart Solutions Space",
            "Creative Tech Corner", "Network Navigator", "Information Technology Institute", "Cybersecurity Command Center",
            "Digital Innovation Institute", "Code Craftsmanship Classroom", "Data Management Mansion", "Machine Learning Lab",
            "Web Design Workshop", "User Experience University", "Tech Integration Institute", "Software Engineering Studio",
            "Data Mining Den", "IT Support Station", "Cloud Solutions Center", "Digital Transformation Training Room",
            "Technology Trends Theater", "Smart Device Studio", "IT Operations Oasis", "Mobile Development Den",
            "Tech Enthusiasts' Hub", "Information Systems Institute", "Cyber Defense Domain", "Programming Prodigy Place",
            "Innovation Incubator", "Future Technologies Forum", "Gadget Guru's Garage", "Sustainable Tech Space",
            "Coding Champions Classroom", "E-Learning Environment", "Tech Resource Room", "Digi-Tech Depot"
    };
    private final Random random = new Random();

    public String getRandomClassroomName() {
        int index = random.nextInt(this.classroomNames.length);
        return this.classroomNames[index];
    }
}
