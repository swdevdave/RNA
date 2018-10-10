class RnaTranscription {

    String transcribe(String dnaStrand) {

        String newString = "";

        if (dnaStrand.isEmpty())
            return "";

        for (int i = 0; i < dnaStrand.length(); i++) {

            if (dnaStrand.charAt(i) == 'C')
                newString = newString + "G";

            if (dnaStrand.charAt(i) == 'G')
                newString = newString + "C";

            if (dnaStrand.charAt(i) == 'A')
                newString = newString + "U";

            if (dnaStrand.charAt(i) == 'T')
                newString = newString + "A";
        }

        return newString;
    }
}