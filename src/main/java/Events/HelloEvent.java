package Events;

import net.dv8tion.jda.core.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class HelloEvent extends ListenerAdapter {

    public void onGuildFirstJoin(GuildMemberJoinEvent event) {


    }


    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String message = event.getMessage().getContentRaw();
        String[] messageList = {"Hi", " Suhdude", "meddl", "hello", "Hello"};

        if (!event.getAuthor().isBot() && message.equals(messageList[0])) {

            event.getMessage().getTextChannel().sendMessage(messageList[1]+" "+event.getMember().getAsMention()).queue();

        } else if (!event.getAuthor().isBot() && message.equals(messageList[1])) {

            event.getMessage().getTextChannel().sendMessage(messageList[2]+" "+event.getMember().getAsMention()).queue();

        } else if (!event.getAuthor().isBot() && message.equals(messageList[2])) {

            event.getMessage().getTextChannel().sendMessage(messageList[0]+" "+event.getMember().getAsMention()).queue();

        } else if (!event.getAuthor().isBot() && message.equals(messageList[3])) {

            event.getMessage().getTextChannel().sendMessage(messageList[2]+" "+event.getMember().getAsMention()).queue();

        } else if (!event.getAuthor().isBot() && message.equals(messageList[4])) {

            event.getMessage().getTextChannel().sendMessage(messageList[1]+" "+event.getMember().getAsMention()).queue();

        }


    }
}