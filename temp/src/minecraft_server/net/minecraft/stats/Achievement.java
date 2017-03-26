package net.minecraft.stats;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.AchievementList;
import net.minecraft.stats.StatBase;
import net.minecraft.util.IJsonSerializable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;

public class Achievement extends StatBase {
   public final int field_75993_a;
   public final int field_75991_b;
   public final Achievement field_75992_c;
   private final String field_75996_k;
   public final ItemStack field_75990_d;
   private boolean field_75995_m;

   public Achievement(String p_i46327_1_, String p_i46327_2_, int p_i46327_3_, int p_i46327_4_, Item p_i46327_5_, Achievement p_i46327_6_) {
      this(p_i46327_1_, p_i46327_2_, p_i46327_3_, p_i46327_4_, new ItemStack(p_i46327_5_), p_i46327_6_);
   }

   public Achievement(String p_i45301_1_, String p_i45301_2_, int p_i45301_3_, int p_i45301_4_, Block p_i45301_5_, Achievement p_i45301_6_) {
      this(p_i45301_1_, p_i45301_2_, p_i45301_3_, p_i45301_4_, new ItemStack(p_i45301_5_), p_i45301_6_);
   }

   public Achievement(String p_i45302_1_, String p_i45302_2_, int p_i45302_3_, int p_i45302_4_, ItemStack p_i45302_5_, Achievement p_i45302_6_) {
      super(p_i45302_1_, new TextComponentTranslation("achievement." + p_i45302_2_, new Object[0]));
      this.field_75990_d = p_i45302_5_;
      this.field_75996_k = "achievement." + p_i45302_2_ + ".desc";
      this.field_75993_a = p_i45302_3_;
      this.field_75991_b = p_i45302_4_;
      if(p_i45302_3_ < AchievementList.field_76010_a) {
         AchievementList.field_76010_a = p_i45302_3_;
      }

      if(p_i45302_4_ < AchievementList.field_76008_b) {
         AchievementList.field_76008_b = p_i45302_4_;
      }

      if(p_i45302_3_ > AchievementList.field_76009_c) {
         AchievementList.field_76009_c = p_i45302_3_;
      }

      if(p_i45302_4_ > AchievementList.field_76006_d) {
         AchievementList.field_76006_d = p_i45302_4_;
      }

      this.field_75992_c = p_i45302_6_;
   }

   public Achievement func_75966_h() {
      this.field_75972_f = true;
      return this;
   }

   public Achievement func_75987_b() {
      this.field_75995_m = true;
      return this;
   }

   public Achievement func_75971_g() {
      super.func_75971_g();
      AchievementList.field_187981_e.add(this);
      return this;
   }

   public boolean func_75967_d() {
      return true;
   }

   public ITextComponent func_150951_e() {
      ITextComponent itextcomponent = super.func_150951_e();
      itextcomponent.func_150256_b().func_150238_a(this.func_75984_f()?TextFormatting.DARK_PURPLE:TextFormatting.GREEN);
      return itextcomponent;
   }

   public Achievement func_150953_b(Class<? extends IJsonSerializable> p_150953_1_) {
      return (Achievement)super.func_150953_b(p_150953_1_);
   }

   public boolean func_75984_f() {
      return this.field_75995_m;
   }
}