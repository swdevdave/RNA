class RnaTranscription {

    String transcribe(String dnaStrand) {

        if (dnaStrand.isEmpty())
            return "";

        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < dnaStrand.length(); i++) {

            switch (dnaStrand.charAt(i)) {
                case 'C':
                    newString.append("G");
                    break;
                case 'G':
                    newString.append("C");
                    break;
                case 'A':
                    newString.append("U");
                    break;
                case 'T':
                    newString.append("A");
                    break;
            }
        }return newString.toString();
    }
}
