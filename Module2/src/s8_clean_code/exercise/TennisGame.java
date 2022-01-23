package s8_clean_code.exercise;

public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String notifyScore = "";
        int tempScore = 0;
        if (player1Score == player2Score) {
            notifyScore = getResultDraw(player1Score);
        } else if (player1Score >= 4 || player2Score >= 4) {
            notifyScore = getResult(player1Score, player2Score);
        } else {
            notifyScore = getResultPlayer(player1Score, player2Score, notifyScore);
        }
        return notifyScore;
    }

    private static String getResultPlayer(int player1Score, int player2Score, String notifyScore) {
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) {
                tempScore = player1Score;
            } else {
                notifyScore += "-";
                tempScore = player2Score;
            }
            switch (tempScore) {
                case 0:
                    notifyScore += "Love";
                    break;
                case 1:
                    notifyScore += "Fifteen";
                    break;
                case 2:
                    notifyScore += "Thirty";
                    break;
                case 3:
                    notifyScore += "Forty";
                    break;
            }
        }
        return notifyScore;
    }

    private static String getResultDraw(int player1Score) {
        String notifyScore;
        switch (player1Score) {
            case 0:
                notifyScore = "Love-All";
                break;
            case 1:
                notifyScore = "Fifteen-All";
                break;
            case 2:
                notifyScore = "Thirty-All";
                break;
            case 3:
                notifyScore = "Forty-All";
                break;
            default:
                notifyScore = "Deuce";
                break;

        }
        return notifyScore;
    }

    private static String getResult(int player1Score, int player2Score) {
        String result;
        int minusResult = player1Score - player2Score;
        if (minusResult == 1) {
            result = "Advantage player1";
        } else if (minusResult == -1) {
            result = "Advantage player2";
        } else if (minusResult >= 2) {
            result = "Win for player1";
        } else {
            result = "Win for player2";
        }
        return result;
    }
}
