class RnaTranscription {

    String transcribe(String dnaStrand) {

        StringBuilder newString = new StringBuilder();

        if (dnaStrand.isEmpty())
            return "";


        for (int i = 0; i < dnaStrand.length(); i++) {

            switch (dnaStrand.charAt(i)){
                case  'C':
                newString.append("G");

                case 'G':
                newString.append("C");

                case 'A':
                newString.append("U");

                case 'T':
                newString.append("A");
                }
        }
        return newString.toString();
    }
}