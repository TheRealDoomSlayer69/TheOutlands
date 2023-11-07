package com.TheRealDoomSlayer69.theoutlands.entity.outlander.data;

import com.TheRealDoomSlayer69.theoutlands.entity.outlander.profession.OutlanderProfessions;
import com.TheRealDoomSlayer69.theoutlands.registry.OutRegistry;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;


public class OutlanderData {
    public static final int MIN_OUTLANDER_LEVEL = 1;
    public static final int MAX_OUTLANDER_LEVEL = 6;
    private static final int[] NEXT_LEVEL_XP_THRESHOLDS = new int[]{0, 10, 70, 150, 250};
    public static final Codec<OutlanderData> CODEC = RecordCodecBuilder.create((p_35570_) -> {
    OutRegistry.OUTLANDER_PROFESSIONS.get().getCodec().fieldOf("profession").orElseGet(() -> {
            return OutlanderProfessions.NONE;
        }).forGetter((p_150022_) -> {
            return p_150022_.profession;
        }), Codec.INT.fieldOf("level").orElse(1).forGetter((p_150020_) -> {
            return p_150020_.level;
        }))
    });

    private final OutlanderProfessions profession;
    private final int level;

    public OutlanderData(OutlanderProfessions p_35558_, int p_35559_) {
        this.profession = p_35558_;
        this.level = Math.max(1, p_35559_);
    }


    public OutlanderProfessions getProfession() {
        return this.profession;
    }

    public int getLevel() {
        return this.level;
    }



    public OutlanderData setProfession(OutlanderProfessions pProfession) {
        return new OutlanderData( pProfession, this.level);
    }

    public OutlanderData setLevel(int pLevel) {
        return new OutlanderData( this.profession, pLevel);
    }

    public static int getMinXpPerLevel(int pLevel) {
        return canLevelUp(pLevel) ? NEXT_LEVEL_XP_THRESHOLDS[pLevel - 1] : 0;
    }

    public static int getMaxXpPerLevel(int pLevel) {
        return canLevelUp(pLevel) ? NEXT_LEVEL_XP_THRESHOLDS[pLevel] : 0;
    }

    public static boolean canLevelUp(int pLevel) {
        return pLevel >= 1 && pLevel < 5;
    }
}
