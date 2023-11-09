package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public enum Answers {
    GREETINGS {
        @Override
        public String toString() {
            return "Greetings from server!!!";
        }
    },
    CHECK {
        @Override
        public String toString() {
            return "Server: Why your greetings with russian-pig-dog letter?" +
                    "\nServer: Що таке паляниця?";
        }
    },
    CORRECT_ANSWER {
        @Override
        public String toString() {
            return "Server: Ok. You are not russian-pig-dog. Date now: ";
        }
    },
    NOT_CORRECT_ANSWER {
        @Override
        public String toString() {
            return "Server: Answer is not correct! You are stupid russian-pig-dog!";
        }
    },
    DATE {
        @Override
        public String toString() {
            return LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        }
    }

}
