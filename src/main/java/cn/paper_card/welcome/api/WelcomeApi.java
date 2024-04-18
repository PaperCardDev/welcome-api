package cn.paper_card.welcome.api;

@SuppressWarnings("unused")
public interface WelcomeApi {


    /**
     * 配置或刷新玩家的显示名称（displayName）
     *
     * @param player 玩家，类型为：org.bukkit.entity.Player，不要传null
     */
    void configDisplayName(Object player);
}
