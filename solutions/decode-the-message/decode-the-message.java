class Solution {
    public String decodeMessage(String key, String message) {
        char[] map = new char[26];
        boolean[] used = new boolean[26];
        int currentChar = 0;
        
        for (int i = 0; i < key.length(); i++) {
            char keyChar = key.charAt(i);
            if (keyChar != ' ' && map[keyChar - 'a'] == 0) {
                map[keyChar - 'a'] = (char) (currentChar + 'a');
                currentChar++;
            }
        }

        StringBuilder decodedMessage = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char messageChar = message.charAt(i);
            if (messageChar != ' ') {
                decodedMessage.append(map[messageChar - 'a']);
            } else {
                decodedMessage.append(' ');
            }
        }

        return decodedMessage.toString();
    }
}
