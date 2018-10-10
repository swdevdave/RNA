class RnaTranscription {

    String transcribe(String dnaStrand) {

        String newString = "";

        if (dnaStrand.isEmpty())
            return "";

        for (int i = 0; i < dnaStrand.length(); i++) {

            switch (dnaStrand.charAt(i)){
                case 'C':
                    newString += "G";
                case 'G':
                    newString += "C";
                case 'A':
                    newString += "U";
                case 'T':
                    newString += "A";
            }
        }return newString;
    }
} 
