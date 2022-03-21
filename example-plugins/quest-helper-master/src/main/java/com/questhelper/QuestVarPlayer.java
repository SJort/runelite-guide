package com.questhelper;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Server controlled "content-developer" integers.
 *
 * VarPlayers are stored per RuneScape player save, and synchronized
 * from the server to the client. The client can change them preemptively
 * if it thinks they will change the next tick as a lag-hiding measure.
 * The client CANNOT directly make the server change a varbit.
 */
@AllArgsConstructor
@Getter
public enum QuestVarPlayer
{
	/**
	 * f2p Quest varbits, these don't hold the completion value.
	 */
	QUEST_BLACK_KNIGHTS_FORTRESS(130),
	QUEST_COOKS_ASSISTANT(29),
	QUEST_DORICS_QUEST(31),
	QUEST_DRAGON_SLAYER_I(176),
	QUEST_ERNEST_THE_CHICKEN(32),
	QUEST_IMP_CATCHER(160),
	QUEST_THE_KNIGHTS_SWORD(122),
	QUEST_PIRATES_TREASURE(71),
	QUEST_PRINCE_ALI_RESCUE(273),
	QUEST_THE_RESTLESS_GHOST(107),
	QUEST_ROMEO_AND_JULIET(144),
	QUEST_RUNE_MYSTERIES(63),
	QUEST_SHEEP_SHEARER(179),
	QUEST_SHIELD_OF_ARRAV(145),
	QUEST_SHIELD_OF_ARRAV_STATE_146(146),
	QUEST_VAMPYRE_SLAYER(178),
	QUEST_WITCHS_POTION(67),

	/**
	 * member Quest varbits, these don't hold the completion value.
	 */
	QUEST_BIG_CHOMPY_BIRD_HUNTING(293),
	QUEST_BIOHAZARD(68),
	QUEST_CABIN_FEVER(655),
	QUEST_CLOCK_TOWER(10),
	QUEST_CREATURE_OF_FENKENSTRAIN(399),
	QUEST_DEATH_PLATEAU(314),
	QUEST_THE_DIG_SITE(131),
	QUEST_DRUIDIC_RITUAL(80),
	QUEST_DWARF_CANNON(0),
	QUEST_EADGARS_RUSE(335),
	QUEST_ELEMENTAL_WORKSHOP_I(299),
	QUEST_FAMILY_CREST(148),
	QUEST_FIGHT_ARENA(17),
	QUEST_FISHING_CONTEST(11),
	QUEST_THE_FREMENNIK_TRIALS(347),
	QUEST_WATERFALL_QUEST(65),
	QUEST_GERTRUDES_CAT(180),
	QUEST_THE_GRAND_TREE(150),
	QUEST_HAUNTED_MINE(382),
	QUEST_HAZEEL_CULT(223),
	QUEST_HEROES_QUEST(188),
	QUEST_HOLY_GRAIL(5),
	QUEST_IN_SEARCH_OF_THE_MYREQUE(387),
	QUEST_JUNGLE_POTION(175),
	QUEST_LEGENDS_QUEST(139),
	QUEST_LOST_CITY(147),
	QUEST_MERLINS_CRYSTAL(14),
	QUEST_MONKEY_MADNESS_I(365),
	QUEST_MONKS_FRIEND(30),
	QUEST_MOURNINGS_END_PART_I(517),
	QUEST_MURDER_MYSTERY(192),
	QUEST_NATURE_SPIRIT(307),
	QUEST_OBSERVATORY_QUEST(112),
	QUEST_ONE_SMALL_FAVOUR(416),
	QUEST_PLAGUE_CITY(165),
	QUEST_PRIEST_IN_PERIL(302),
	QUEST_RAG_AND_BONE_MAN_I(714),
	QUEST_REGICIDE(328),
	QUEST_ROVING_ELVES(402),
	QUEST_RUM_DEAL(600),
	QUEST_SCORPION_CATCHER(76),
	QUEST_SEA_SLUG(159),
	QUEST_SHADES_OF_MORTTON(339),
	QUEST_SHEEP_HERDER(60),
	QUEST_SHILO_VILLAGE(116),
	QUEST_TAI_BWO_WANNAI_TRIO(320),
	QUEST_TEMPLE_OF_IKOV(26),
	QUEST_THRONE_OF_MISCELLANIA(359),
	QUEST_THE_TOURIST_TRAP(197),
	QUEST_WITCHS_HOUSE(226),
	QUEST_TREE_GNOME_VILLAGE(111),
	QUEST_TRIBAL_TOTEM(200),
	QUEST_TROLL_ROMANCE(385),
	QUEST_TROLL_STRONGHOLD(317),
	QUEST_UNDERGROUND_PASS(161),
	QUEST_UNDERGROUND_PASS_STATE_162(162),
	QUEST_WATCHTOWER(212),
	QUEST_THE_GREAT_BRAIN_ROBBERY(980),
	QUEST_RAG_AND_BONE_MAN_II(714),

	/**
	 * mini-quest varbits, these don't hold the completion value.
	 */
	QUEST_ENTER_THE_ABYSS(492),
	QUEST_ALFRED_GRIMHANDS_BARCRAWL(77),
	QUEST_ALFRED_GRIMHANDS_BARCRAWL_STATE_76(76),
	QUEST_THE_MAGE_ARENA(267);


	private final int id;
}
