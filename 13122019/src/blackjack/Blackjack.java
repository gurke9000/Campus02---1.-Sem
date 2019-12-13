package blackjack;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.HashMap;

public class Blackjack {

        private HashMap<Player,Integer> players = new HashMap<>();


        public boolean add(Player player)
        {

                if(players.containsKey(player))
                {
                    return false;
                }
                else
                {
                    players.put(player,0);
                    return true;
                }
            }


        public boolean addCard(Player player, Integer cardValue)
        {
                if (players.containsKey(player)) {
                    Integer newVal = players.get(player) + cardValue;
                    players.put(player,newVal);
                    return true;
                }
                else
                {
                    return false;
                }
            }


        public Integer getValue(Player player)
        {

                return players.get(player);
        }


    @Override
    public String toString() {
            String output = "";
            for(Player p : players.keySet())
            {
                output += (p.getName() + ", " + "Kartenwert: " + players.get(p));
                output += System.lineSeparator();
            }
        return output;
    }

}

