package Events;

import net.dv8tion.jda.core.events.guild.voice.GuildVoiceJoinEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class AutoChannel extends ListenerAdapter {


    public void onGuildVoiceJoin(GuildVoiceJoinEvent event){

        if (event.getGuild().getVoiceChannelById(523841633666596864l).getMembers().){

        }

    }
}
