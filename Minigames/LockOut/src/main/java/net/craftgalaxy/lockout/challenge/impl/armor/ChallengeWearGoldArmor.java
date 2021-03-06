package net.craftgalaxy.lockout.challenge.impl.armor;

import com.destroystokyo.paper.event.player.PlayerArmorChangeEvent;
import net.craftgalaxy.lockout.challenge.types.PlayerArmorChallenge;
import net.craftgalaxy.lockout.minigame.LockOut;
import net.craftgalaxy.minigameservice.bukkit.util.ItemUtil;
import net.craftgalaxy.minigameservice.bukkit.util.PlayerUtil;
import org.bukkit.inventory.ItemStack;

public class ChallengeWearGoldArmor extends PlayerArmorChallenge {

	public ChallengeWearGoldArmor(LockOut lockOut) {
		super(lockOut);
	}

	@Override
	public boolean handle(PlayerArmorChangeEvent e) {
		ItemStack item = e.getNewItem();
		if (item != null && ItemUtil.isGoldenArmorType(item.getType()) && PlayerUtil.isWearingGoldenArmor(e.getPlayer())) {
			this.lockOut.completeChallenge(e.getPlayer(), this);
			return true;
		}

		return false;
	}

	@Override
	public String getDisplayMessage() {
		return "Wear a full set of gold armor!";
	}
}
