package Bot_2;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

import java.util.logging.Level;

public class Bot extends TelegramLongPollingBot {

        @Override
        public void onUpdateReceived(Update update) {
            String message = update.getMessage().getText();
            sendMsg(update.getMessage().getChatId().toString(), "Ты пидор");
        }

        public synchronized void sendMsg(String chatId, String s) {
            SendMessage sendMessage = new SendMessage();
            sendMessage.enableMarkdown(true);
            sendMessage.setChatId(chatId);
            sendMessage.setText(s);
            try {
                sendMessage(sendMessage);
            } catch (TelegramApiException e) {
             //   log.log(Level.SEVERE, "Exception: ", e.toString());
            }
        }
        @Override
        public String getBotUsername() {
            return "q0weqewqweu_bot";
        }

    @Override
    public String getBotToken() {
        return "502489999:AAGMLnVOW4mU3NNGLnCKYeWF2j0hpm9luxM";
    }


}
