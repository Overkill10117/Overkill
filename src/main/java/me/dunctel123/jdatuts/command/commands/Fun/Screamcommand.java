package me.dunctel123.jdatuts.command.commands.Fun;

import me.duncte123.botcommons.messaging.EmbedUtils;
import me.dunctel123.jdatuts.command.CommandContext;
import me.dunctel123.jdatuts.command.ICommand;
import me.dunctel123.jdatuts.command.commands.Emoji;
import net.dv8tion.jda.api.EmbedBuilder;

public class Screamcommand implements ICommand {
    @Override
    public void handle(CommandContext ctx) {
        if (ctx.getArgs().isEmpty()) {
            ctx.getChannel().sendMessage("https://media.discordapp.net/attachments/808867655405666387/815841296593584159/81195a9847a459acbb2b680a70357728.png").queue();
            return;
        }
        if("embed".equals(ctx.getArgs().get(0))) {
            EmbedBuilder embed = EmbedUtils.defaultEmbed()
                    .setAuthor(Emoji.SCREAM, "https://media.discordapp.net/attachments/808867655405666387/815841296593584159/81195a9847a459acbb2b680a70357728.png")
                    .setThumbnail("https://media.discordapp.net/attachments/808867655405666387/815841296593584159/81195a9847a459acbb2b680a70357728.png")
                    .setTitle("SCREAM")
                    .setDescription(Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM)
                    .setImage("https://media.discordapp.net/attachments/808867655405666387/815841296593584159/81195a9847a459acbb2b680a70357728.png")
                    .setFooter(Emoji.SCREAM);
            ctx.getChannel().sendMessage(embed.build()).queue();
            return;
        }
        if ("cat".equals(ctx.getArgs().get(0))) {
            ctx.getChannel().sendMessage("https://media.discordapp.net/attachments/808867655405666387/815844958883676240/3068417ae7f1a7c5c2ba60ab1aa1fb62.png").queue();
            ctx.getChannel().sendMessage("https://media.discordapp.net/attachments/808867655405666387/815841296593584159/81195a9847a459acbb2b680a70357728.png").queue();
        return;
        }
        if ("catembed".equals(ctx.getArgs().get(0))) {
            EmbedBuilder embed = EmbedUtils.defaultEmbed()
                    .setAuthor(Emoji.SCREAM + Emoji.CAT_SCREAM, "https://media.discordapp.net/attachments/808867655405666387/815841296593584159/81195a9847a459acbb2b680a70357728.png" + "https://media.discordapp.net/attachments/808867655405666387/815844958883676240/3068417ae7f1a7c5c2ba60ab1aa1fb62.png")
                    .setThumbnail("https://media.discordapp.net/attachments/808867655405666387/815844958883676240/3068417ae7f1a7c5c2ba60ab1aa1fb62.png")
                    .setTitle("SCREAM")
                    .setDescription(Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM + Emoji.SCREAM + Emoji.CAT_SCREAM)
                    .setImage("https://media.discordapp.net/attachments/808867655405666387/815844958883676240/3068417ae7f1a7c5c2ba60ab1aa1fb62.png" + "https://media.discordapp.net/attachments/808867655405666387/815841296593584159/81195a9847a459acbb2b680a70357728.png")
                    .setFooter(Emoji.SCREAM + Emoji.CAT_SCREAM);
            ctx.getChannel().sendMessage(embed.build()).queue();
            return;

        }


        }

    @Override
    public String getName() {
        return "scream";
    }

    @Override
    public String getHelp() {
        return "SCREAM";
    }
}
