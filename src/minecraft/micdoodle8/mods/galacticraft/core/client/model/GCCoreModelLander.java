package micdoodle8.mods.galacticraft.core.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

import org.lwjgl.opengl.GL11;

import com.overminddl1.mods.NMT.NMTModelRenderer;

public class GCCoreModelLander extends ModelBase
{
	NMTModelRenderer BodyMain1;
	NMTModelRenderer BodyMain2;
	NMTModelRenderer BodyAux1;
	NMTModelRenderer BodyAux2;
	NMTModelRenderer BodyAux3;
	NMTModelRenderer BodyAux4;
	NMTModelRenderer BodySupportMain1;
	NMTModelRenderer BodySupportMain2;
	NMTModelRenderer LegStructure2a;
	NMTModelRenderer LegStructureAux2a;
	NMTModelRenderer LegBase2a;
	NMTModelRenderer LegBase3a;
	NMTModelRenderer LegStructureAux1a;
	NMTModelRenderer LegStructure3b;
	NMTModelRenderer FootBasea;
	NMTModelRenderer LegStructureAux3a;
	NMTModelRenderer LegStructure1a;
	NMTModelRenderer LegBase1a;
	NMTModelRenderer FootJointa;
	NMTModelRenderer FootBaseb;
	NMTModelRenderer LegBase3b;
	NMTModelRenderer LegBase1b;
	NMTModelRenderer LegBase2b;
	NMTModelRenderer LegStructureAux3b;
	NMTModelRenderer LegStructure2b;
	NMTModelRenderer LegStructureAux2b;
	NMTModelRenderer LegStructureAux1b;
	NMTModelRenderer LegStructure3c;
	NMTModelRenderer LegStructure1c;
	NMTModelRenderer FootJointd;
	NMTModelRenderer FootBasee;
	NMTModelRenderer FootBasef;
	NMTModelRenderer LegBase3g;
	NMTModelRenderer LegBase1h;
	NMTModelRenderer LegBase2i;
	NMTModelRenderer LegStructureAux3j;
	NMTModelRenderer LegStructure2k;
	NMTModelRenderer LegStructureAux2l;
	NMTModelRenderer LegStructureAux1m;
	NMTModelRenderer LegStructure3n;
	NMTModelRenderer LegStructure1o;
	NMTModelRenderer FootJointp;
	NMTModelRenderer FootBaseq;
	NMTModelRenderer FootBaser;
	NMTModelRenderer LegBase3s;
	NMTModelRenderer LegBase1t;
	NMTModelRenderer LegBase2u;
	NMTModelRenderer LegStructureAux3v;
	NMTModelRenderer LegStructure2w;
	NMTModelRenderer LegStructureAux2x;
	NMTModelRenderer LegStructureAux1y;
	NMTModelRenderer LegStructure3z;
	NMTModelRenderer LegStructure1aa;
	NMTModelRenderer FootJointab;
	NMTModelRenderer FootBaseac;
	NMTModelRenderer FootBasead;
	NMTModelRenderer ModuleMain1;
	NMTModelRenderer ModuleMain2;
	NMTModelRenderer ModuleMainDeco;
	NMTModelRenderer ModuleCore1;
	NMTModelRenderer ModuleCore2;
	NMTModelRenderer ModuleCore3;
	NMTModelRenderer ModuleAux1;
	NMTModelRenderer ModuleAux2;
	NMTModelRenderer ModuleAux3;
	NMTModelRenderer ModuleAux4;
	NMTModelRenderer ModuleAux5;
	NMTModelRenderer ModuleAux6;
	NMTModelRenderer ModuleAux7;
	NMTModelRenderer ModuleAux8;
	NMTModelRenderer ModuleThrusterBase1;
	NMTModelRenderer ModuleThrusterBase2;
	NMTModelRenderer ModuleThrusterBase3;
	NMTModelRenderer ModuleThrusterBase4;
	NMTModelRenderer ModuleThrusterBase5;
	NMTModelRenderer ModuleThrusterConeTop1;
	NMTModelRenderer ModuleThrusterConeTop2;
	NMTModelRenderer ModuleThrusterConeTop3;
	NMTModelRenderer ModuleThrusterConeBack1;
	NMTModelRenderer ModuleThrusterConeBack2;
	NMTModelRenderer ModuleThrusterConeBack3;
	NMTModelRenderer ModuleThrusterConeBot1;
	NMTModelRenderer ModuleThrusterConeBot2;
	NMTModelRenderer ModuleThrusterConeBot3;
	NMTModelRenderer ModuleThrusterConeFront1;
	NMTModelRenderer ModuleThrusterConeFront2;
	NMTModelRenderer ModuleThrusterConeFront3;

	public GCCoreModelLander()
	{
		this.textureWidth = 512;
		this.textureHeight = 512;

		this.BodyMain1 = new NMTModelRenderer(this, 0, 0);
		this.BodyMain1.addBox(-24F, 0.001F, -24F, 48, 12, 48);
		this.BodyMain1.setRotationPoint(0F, 0F, 0F);
		this.BodyMain1.setTextureSize(64, 32);
		this.BodyMain1.mirror = true;
		this.setRotation(this.BodyMain1, 0F, -0.3926991F, 0F);
		this.BodyMain2 = new NMTModelRenderer(this, 0, 0);
		this.BodyMain2.addBox(-24F, 0F, -24F, 48, 12, 48);
		this.BodyMain2.setRotationPoint(0F, 0F, 0F);
		this.BodyMain2.setTextureSize(64, 32);
		this.BodyMain2.mirror = true;
		this.setRotation(this.BodyMain2, 0F, 0.3926991F, 0F);
		this.BodyAux1 = new NMTModelRenderer(this, 0, 0);
		this.BodyAux1.addBox(-13F, -5F, -34F, 26, 15, 34);
		this.BodyAux1.setRotationPoint(0F, 0F, 0F);
		this.BodyAux1.setTextureSize(64, 32);
		this.BodyAux1.mirror = true;
		this.setRotation(this.BodyAux1, 0.0698132F, 0.7853982F, 0F);
		this.BodyAux2 = new NMTModelRenderer(this, 0, 0);
		this.BodyAux2.addBox(-13F, -5F, -34F, 26, 15, 34);
		this.BodyAux2.setRotationPoint(0F, 0F, 0F);
		this.BodyAux2.setTextureSize(64, 32);
		this.BodyAux2.mirror = true;
		this.setRotation(this.BodyAux2, 0.0698132F, -0.7853982F, 0F);
		this.BodyAux3 = new NMTModelRenderer(this, 0, 0);
		this.BodyAux3.addBox(-13F, -5F, -34F, 26, 15, 34);
		this.BodyAux3.setRotationPoint(0F, 0F, 0F);
		this.BodyAux3.setTextureSize(64, 32);
		this.BodyAux3.mirror = true;
		this.setRotation(this.BodyAux3, 0.0698132F, -2.356194F, 0F);
		this.BodyAux4 = new NMTModelRenderer(this, 0, 0);
		this.BodyAux4.addBox(-13F, -5F, -34F, 26, 15, 34);
		this.BodyAux4.setRotationPoint(0F, 0F, 0F);
		this.BodyAux4.setTextureSize(64, 32);
		this.BodyAux4.mirror = true;
		this.setRotation(this.BodyAux4, 0.0698132F, 2.356194F, 0F);
		this.BodySupportMain1 = new NMTModelRenderer(this, 0, 0);
		this.BodySupportMain1.addBox(-19F, -7F, -19F, 38, 10, 38);
		this.BodySupportMain1.setRotationPoint(0F, 0F, 0F);
		this.BodySupportMain1.setTextureSize(64, 32);
		this.BodySupportMain1.mirror = true;
		this.setRotation(this.BodySupportMain1, 0F, 0F, 0F);
		this.BodySupportMain2 = new NMTModelRenderer(this, 0, 0);
		this.BodySupportMain2.addBox(-12F, -15F, -12F, 24, 15, 24);
		this.BodySupportMain2.setRotationPoint(0F, 0F, 0F);
		this.BodySupportMain2.setTextureSize(64, 32);
		this.BodySupportMain2.mirror = true;
		this.setRotation(this.BodySupportMain2, 0F, 0F, 0F);
		this.LegStructure2a = new NMTModelRenderer(this, 0, 0);
		this.LegStructure2a.addBox(-21F, 33F, -19F, 5, 14, 5);
		this.LegStructure2a.setRotationPoint(0F, 0F, 0F);
		this.LegStructure2a.setTextureSize(64, 32);
		this.LegStructure2a.mirror = true;
		this.setRotation(this.LegStructure2a, 0.7504916F, -2.86234F, 0.7853982F);
		this.LegStructureAux2a = new NMTModelRenderer(this, 0, 0);
		this.LegStructureAux2a.addBox(-20F, 28F, -18F, 3, 24, 3);
		this.LegStructureAux2a.setRotationPoint(0F, 0F, 0F);
		this.LegStructureAux2a.setTextureSize(64, 32);
		this.LegStructureAux2a.mirror = true;
		this.setRotation(this.LegStructureAux2a, 0.7504916F, -2.86234F, 0.7853982F);
		this.LegBase2a = new NMTModelRenderer(this, 0, 0);
		this.LegBase2a.addBox(-23F, 20F, -21F, 9, 9, 9);
		this.LegBase2a.setRotationPoint(0F, 0F, 0F);
		this.LegBase2a.setTextureSize(64, 32);
		this.LegBase2a.mirror = true;
		this.setRotation(this.LegBase2a, 0.7504916F, -2.86234F, 0.7853982F);
		this.LegBase3a = new NMTModelRenderer(this, 0, 0);
		this.LegBase3a.addBox(-26F, 19F, 10F, 9, 9, 9);
		this.LegBase3a.setRotationPoint(0F, 0F, 0F);
		this.LegBase3a.setTextureSize(64, 32);
		this.LegBase3a.mirror = true;
		this.setRotation(this.LegBase3a, -0.7679449F, -1.850049F, 0.6981317F);
		this.LegStructureAux1a = new NMTModelRenderer(this, 0, 0);
		this.LegStructureAux1a.addBox(-26F, 28F, -2F, 3, 24, 3);
		this.LegStructureAux1a.setRotationPoint(0F, 0F, 0F);
		this.LegStructureAux1a.setTextureSize(64, 32);
		this.LegStructureAux1a.mirror = true;
		this.setRotation(this.LegStructureAux1a, 0F, -2.356194F, 0.7330383F);
		this.LegStructure3b = new NMTModelRenderer(this, 0, 0);
		this.LegStructure3b.addBox(-24F, 32F, 12F, 5, 14, 5);
		this.LegStructure3b.setRotationPoint(0F, 0F, 0F);
		this.LegStructure3b.setTextureSize(64, 32);
		this.LegStructure3b.mirror = true;
		this.setRotation(this.LegStructure3b, -0.7679449F, -1.850049F, 0.6981317F);
		this.FootBasea = new NMTModelRenderer(this, 0, 0);
		this.FootBasea.addBox(-64F, 19F, -2F, 11, 6, 2);
		this.FootBasea.setRotationPoint(0F, 0F, 0F);
		this.FootBasea.setTextureSize(64, 32);
		this.FootBasea.mirror = true;
		this.setRotation(this.FootBasea, 0F, -2.356194F, 0F);
		this.LegStructureAux3a = new NMTModelRenderer(this, 0, 0);
		this.LegStructureAux3a.addBox(-23F, 27F, 13F, 3, 24, 3);
		this.LegStructureAux3a.setRotationPoint(0F, 0F, 0F);
		this.LegStructureAux3a.setTextureSize(64, 32);
		this.LegStructureAux3a.mirror = true;
		this.setRotation(this.LegStructureAux3a, -0.7679449F, -1.850049F, 0.6981317F);
		this.LegStructure1a = new NMTModelRenderer(this, 0, 0);
		this.LegStructure1a.addBox(-27F, 33F, -3F, 5, 14, 5);
		this.LegStructure1a.setRotationPoint(0F, 0F, 0F);
		this.LegStructure1a.setTextureSize(64, 32);
		this.LegStructure1a.mirror = true;
		this.setRotation(this.LegStructure1a, 0F, -2.356194F, 0.7330383F);
		this.LegBase1a = new NMTModelRenderer(this, 0, 0);
		this.LegBase1a.addBox(-29F, 20F, -5F, 9, 9, 9);
		this.LegBase1a.setRotationPoint(0F, 0F, 0F);
		this.LegBase1a.setTextureSize(64, 32);
		this.LegBase1a.mirror = true;
		this.setRotation(this.LegBase1a, 0F, -2.356194F, 0.7330383F);
		this.FootJointa = new NMTModelRenderer(this, 0, 0);
		this.FootJointa.addBox(-58F, 20F, -6.5F, 7, 5, 11);
		this.FootJointa.setRotationPoint(0F, 0F, 0F);
		this.FootJointa.setTextureSize(64, 32);
		this.FootJointa.mirror = true;
		this.setRotation(this.FootJointa, 0F, -2.356194F, 0F);
		this.FootBaseb = new NMTModelRenderer(this, 0, 0);
		this.FootBaseb.addBox(-62F, 23F, -8.5F, 10, 2, 15);
		this.FootBaseb.setRotationPoint(0F, 0F, 0F);
		this.FootBaseb.setTextureSize(64, 32);
		this.FootBaseb.mirror = true;
		this.setRotation(this.FootBaseb, 0F, -2.356194F, 0F);
		this.LegBase3b = new NMTModelRenderer(this, 0, 0);
		this.LegBase3b.addBox(-26F, 19F, 10F, 9, 9, 9);
		this.LegBase3b.setRotationPoint(0F, 0F, 0F);
		this.LegBase3b.setTextureSize(64, 32);
		this.LegBase3b.mirror = true;
		this.setRotation(this.LegBase3b, -0.7679449F, -0.2792527F, 0.6981317F);
		this.LegBase1b = new NMTModelRenderer(this, 0, 0);
		this.LegBase1b.addBox(-29F, 20F, -5F, 9, 9, 9);
		this.LegBase1b.setRotationPoint(0F, 0F, 0F);
		this.LegBase1b.setTextureSize(64, 32);
		this.LegBase1b.mirror = true;
		this.setRotation(this.LegBase1b, 0F, -0.7853982F, 0.7330383F);
		this.LegBase2b = new NMTModelRenderer(this, 0, 0);
		this.LegBase2b.addBox(-23F, 20F, -21F, 9, 9, 9);
		this.LegBase2b.setRotationPoint(0F, 0F, 0F);
		this.LegBase2b.setTextureSize(64, 32);
		this.LegBase2b.mirror = false;
		this.setRotation(this.LegBase2b, 0.7504916F, -1.291544F, 0.7853982F);
		this.LegStructureAux3b = new NMTModelRenderer(this, 0, 0);
		this.LegStructureAux3b.addBox(-23F, 27F, 13F, 3, 24, 3);
		this.LegStructureAux3b.setRotationPoint(0F, 0F, 0F);
		this.LegStructureAux3b.setTextureSize(64, 32);
		this.LegStructureAux3b.mirror = true;
		this.setRotation(this.LegStructureAux3b, -0.7679449F, -0.2792527F, 0.6981317F);
		this.LegStructure2b = new NMTModelRenderer(this, 0, 0);
		this.LegStructure2b.addBox(-21F, 33F, -19F, 5, 14, 5);
		this.LegStructure2b.setRotationPoint(0F, 0F, 0F);
		this.LegStructure2b.setTextureSize(64, 32);
		this.setRotation(this.LegStructure2b, 0.7504916F, -1.291544F, 0.7853982F);
		this.LegStructureAux2b = new NMTModelRenderer(this, 0, 0);
		this.LegStructureAux2b.addBox(-20F, 28F, -18F, 3, 24, 3);
		this.LegStructureAux2b.setRotationPoint(0F, 0F, 0F);
		this.LegStructureAux2b.setTextureSize(64, 32);
		this.LegStructureAux2b.mirror = true;
		this.setRotation(this.LegStructureAux2b, 0.7504916F, -1.291544F, 0.7853982F);
		this.LegStructureAux1b = new NMTModelRenderer(this, 0, 0);
		this.LegStructureAux1b.addBox(-26F, 28F, -2F, 3, 24, 3);
		this.LegStructureAux1b.setRotationPoint(0F, 0F, 0F);
		this.LegStructureAux1b.setTextureSize(64, 32);
		this.LegStructureAux1b.mirror = true;
		this.setRotation(this.LegStructureAux1b, 0F, -0.7853982F, 0.7330383F);
		this.LegStructure3c = new NMTModelRenderer(this, 0, 0);
		this.LegStructure3c.addBox(-24F, 32F, 12F, 5, 14, 5);
		this.LegStructure3c.setRotationPoint(0F, 0F, 0F);
		this.LegStructure3c.setTextureSize(64, 32);
		this.LegStructure3c.mirror = true;
		this.setRotation(this.LegStructure3c, -0.7679449F, -0.2792527F, 0.6981317F);
		this.LegStructure1c = new NMTModelRenderer(this, 0, 0);
		this.LegStructure1c.addBox(-27F, 33F, -3F, 5, 14, 5);
		this.LegStructure1c.setRotationPoint(0F, 0F, 0F);
		this.LegStructure1c.setTextureSize(64, 32);
		this.LegStructure1c.mirror = true;
		this.setRotation(this.LegStructure1c, 0F, -0.7853982F, 0.7330383F);
		this.FootJointd = new NMTModelRenderer(this, 0, 0);
		this.FootJointd.addBox(-58F, 20F, -6.5F, 7, 5, 11);
		this.FootJointd.setRotationPoint(0F, 0F, 0F);
		this.FootJointd.setTextureSize(64, 32);
		this.FootJointd.mirror = true;
		this.setRotation(this.FootJointd, 0F, -0.7853982F, 0F);
		this.FootBasee = new NMTModelRenderer(this, 0, 0);
		this.FootBasee.addBox(-62F, 23F, -8.5F, 10, 2, 15);
		this.FootBasee.setRotationPoint(0F, 0F, 0F);
		this.FootBasee.setTextureSize(64, 32);
		this.FootBasee.mirror = true;
		this.setRotation(this.FootBasee, 0F, -0.7853982F, 0F);
		this.FootBasef = new NMTModelRenderer(this, 0, 0);
		this.FootBasef.addBox(-64F, 19F, -2F, 11, 6, 2);
		this.FootBasef.setRotationPoint(0F, 0F, 0F);
		this.FootBasef.setTextureSize(64, 32);
		this.FootBasef.mirror = true;
		this.setRotation(this.FootBasef, 0F, -0.7853982F, 0F);
		this.LegBase3g = new NMTModelRenderer(this, 0, 0);
		this.LegBase3g.addBox(-26F, 19F, 10F, 9, 9, 9);
		this.LegBase3g.setRotationPoint(0F, 0F, 0F);
		this.LegBase3g.setTextureSize(64, 32);
		this.LegBase3g.mirror = true;
		this.setRotation(this.LegBase3g, -0.7679449F, 1.291544F, 0.6981317F);
		this.LegBase1h = new NMTModelRenderer(this, 0, 0);
		this.LegBase1h.addBox(-29F, 20F, -5F, 9, 9, 9);
		this.LegBase1h.setRotationPoint(0F, 0F, 0F);
		this.LegBase1h.setTextureSize(64, 32);
		this.LegBase1h.mirror = true;
		this.setRotation(this.LegBase1h, 0F, 0.7853982F, 0.7330383F);
		this.LegBase2i = new NMTModelRenderer(this, 0, 0);
		this.LegBase2i.addBox(-23F, 20F, -21F, 9, 9, 9);
		this.LegBase2i.setRotationPoint(0F, 0F, 0F);
		this.LegBase2i.setTextureSize(64, 32);
		this.LegBase2i.mirror = true;
		this.setRotation(this.LegBase2i, 0.7504916F, 0.2792527F, 0.7853982F);
		this.LegStructureAux3j = new NMTModelRenderer(this, 0, 0);
		this.LegStructureAux3j.addBox(-23F, 27F, 13F, 3, 24, 3);
		this.LegStructureAux3j.setRotationPoint(0F, 0F, 0F);
		this.LegStructureAux3j.setTextureSize(64, 32);
		this.LegStructureAux3j.mirror = true;
		this.setRotation(this.LegStructureAux3j, -0.7679449F, 1.291544F, 0.6981317F);
		this.LegStructure2k = new NMTModelRenderer(this, 0, 0);
		this.LegStructure2k.addBox(-21F, 33F, -19F, 5, 14, 5);
		this.LegStructure2k.setRotationPoint(0F, 0F, 0F);
		this.LegStructure2k.setTextureSize(64, 32);
		this.LegStructure2k.mirror = true;
		this.setRotation(this.LegStructure2k, 0.7504916F, 0.2792527F, 0.7853982F);
		this.LegStructureAux2l = new NMTModelRenderer(this, 0, 0);
		this.LegStructureAux2l.addBox(-20F, 28F, -18F, 3, 24, 3);
		this.LegStructureAux2l.setRotationPoint(0F, 0F, 0F);
		this.LegStructureAux2l.setTextureSize(64, 32);
		this.LegStructureAux2l.mirror = true;
		this.setRotation(this.LegStructureAux2l, 0.7504916F, 0.2792527F, 0.7853982F);
		this.LegStructureAux1m = new NMTModelRenderer(this, 0, 0);
		this.LegStructureAux1m.addBox(-26F, 28F, -2F, 3, 24, 3);
		this.LegStructureAux1m.setRotationPoint(0F, 0F, 0F);
		this.LegStructureAux1m.setTextureSize(64, 32);
		this.LegStructureAux1m.mirror = true;
		this.setRotation(this.LegStructureAux1m, 0F, 0.7853982F, 0.7330383F);
		this.LegStructure3n = new NMTModelRenderer(this, 0, 0);
		this.LegStructure3n.addBox(-24F, 32F, 12F, 5, 14, 5);
		this.LegStructure3n.setRotationPoint(0F, 0F, 0F);
		this.LegStructure3n.setTextureSize(64, 32);
		this.LegStructure3n.mirror = true;
		this.setRotation(this.LegStructure3n, -0.7679449F, 1.291544F, 0.6981317F);
		this.LegStructure1o = new NMTModelRenderer(this, 0, 0);
		this.LegStructure1o.addBox(-27F, 33F, -3F, 5, 14, 5);
		this.LegStructure1o.setRotationPoint(0F, 0F, 0F);
		this.LegStructure1o.setTextureSize(64, 32);
		this.LegStructure1o.mirror = true;
		this.setRotation(this.LegStructure1o, 0F, 0.7853982F, 0.7330383F);
		this.FootJointp = new NMTModelRenderer(this, 0, 0);
		this.FootJointp.addBox(-58F, 20F, -6.5F, 7, 5, 11);
		this.FootJointp.setRotationPoint(0F, 0F, 0F);
		this.FootJointp.setTextureSize(64, 32);
		this.FootJointp.mirror = true;
		this.setRotation(this.FootJointp, 0F, 0.7853982F, 0F);
		this.FootBaseq = new NMTModelRenderer(this, 0, 0);
		this.FootBaseq.addBox(-62F, 23F, -8.5F, 10, 2, 15);
		this.FootBaseq.setRotationPoint(0F, 0F, 0F);
		this.FootBaseq.setTextureSize(64, 32);
		this.FootBaseq.mirror = true;
		this.setRotation(this.FootBaseq, 0F, 0.7853982F, 0F);
		this.FootBaser = new NMTModelRenderer(this, 0, 0);
		this.FootBaser.addBox(-64F, 19F, -2F, 11, 6, 2);
		this.FootBaser.setRotationPoint(0F, 0F, 0F);
		this.FootBaser.setTextureSize(64, 32);
		this.FootBaser.mirror = true;
		this.setRotation(this.FootBaser, 0F, 0.7853982F, 0F);
		this.LegBase3s = new NMTModelRenderer(this, 0, 0);
		this.LegBase3s.addBox(-26F, 19F, 10F, 9, 9, 9);
		this.LegBase3s.setRotationPoint(0F, 0F, 0F);
		this.LegBase3s.setTextureSize(64, 32);
		this.LegBase3s.mirror = true;
		this.setRotation(this.LegBase3s, -0.7679449F, 2.86234F, 0.6981317F);
		this.LegBase1t = new NMTModelRenderer(this, 0, 0);
		this.LegBase1t.addBox(-29F, 20F, -5F, 9, 9, 9);
		this.LegBase1t.setRotationPoint(0F, 0F, 0F);
		this.LegBase1t.setTextureSize(64, 32);
		this.LegBase1t.mirror = true;
		this.setRotation(this.LegBase1t, 0F, 2.356194F, 0.7330383F);
		this.LegBase2u = new NMTModelRenderer(this, 0, 0);
		this.LegBase2u.addBox(-23F, 20F, -21F, 9, 9, 9);
		this.LegBase2u.setRotationPoint(0F, 0F, 0F);
		this.LegBase2u.setTextureSize(64, 32);
		this.LegBase2u.mirror = true;
		this.setRotation(this.LegBase2u, 0.7504916F, 1.850049F, 0.7853982F);
		this.LegStructureAux3v = new NMTModelRenderer(this, 0, 0);
		this.LegStructureAux3v.addBox(-23F, 27F, 13F, 3, 24, 3);
		this.LegStructureAux3v.setRotationPoint(0F, 0F, 0F);
		this.LegStructureAux3v.setTextureSize(64, 32);
		this.LegStructureAux3v.mirror = true;
		this.setRotation(this.LegStructureAux3v, -0.7679449F, 2.86234F, 0.6981317F);
		this.LegStructure2w = new NMTModelRenderer(this, 0, 0);
		this.LegStructure2w.addBox(-21F, 33F, -19F, 5, 14, 5);
		this.LegStructure2w.setRotationPoint(0F, 0F, 0F);
		this.LegStructure2w.setTextureSize(64, 32);
		this.LegStructure2w.mirror = true;
		this.setRotation(this.LegStructure2w, 0.7504916F, 1.850049F, 0.7853982F);
		this.LegStructureAux2x = new NMTModelRenderer(this, 0, 0);
		this.LegStructureAux2x.addBox(-20F, 28F, -18F, 3, 24, 3);
		this.LegStructureAux2x.setRotationPoint(0F, 0F, 0F);
		this.LegStructureAux2x.setTextureSize(64, 32);
		this.LegStructureAux2x.mirror = true;
		this.setRotation(this.LegStructureAux2x, 0.7504916F, 1.850049F, 0.7853982F);
		this.LegStructureAux1y = new NMTModelRenderer(this, 0, 0);
		this.LegStructureAux1y.addBox(-26F, 28F, -2F, 3, 24, 3);
		this.LegStructureAux1y.setRotationPoint(0F, 0F, 0F);
		this.LegStructureAux1y.setTextureSize(64, 32);
		this.LegStructureAux1y.mirror = true;
		this.setRotation(this.LegStructureAux1y, 0F, 2.356194F, 0.7330383F);
		this.LegStructure3z = new NMTModelRenderer(this, 0, 0);
		this.LegStructure3z.addBox(-24F, 32F, 12F, 5, 14, 5);
		this.LegStructure3z.setRotationPoint(0F, 0F, 0F);
		this.LegStructure3z.setTextureSize(64, 32);
		this.LegStructure3z.mirror = true;
		this.setRotation(this.LegStructure3z, -0.7679449F, 2.86234F, 0.6981317F);
		this.LegStructure1aa = new NMTModelRenderer(this, 0, 0);
		this.LegStructure1aa.addBox(-27F, 33F, -3F, 5, 14, 5);
		this.LegStructure1aa.setRotationPoint(0F, 0F, 0F);
		this.LegStructure1aa.setTextureSize(64, 32);
		this.LegStructure1aa.mirror = true;
		this.setRotation(this.LegStructure1aa, 0F, 2.356194F, 0.7330383F);
		this.FootJointab = new NMTModelRenderer(this, 0, 0);
		this.FootJointab.addBox(-58F, 20F, -6.5F, 7, 5, 11);
		this.FootJointab.setRotationPoint(0F, 0F, 0F);
		this.FootJointab.setTextureSize(64, 32);
		this.FootJointab.mirror = true;
		this.setRotation(this.FootJointab, 0F, 2.356194F, 0F);
		this.FootBaseac = new NMTModelRenderer(this, 0, 0);
		this.FootBaseac.addBox(-62F, 23F, -8.5F, 10, 2, 15);
		this.FootBaseac.setRotationPoint(0F, 0F, 0F);
		this.FootBaseac.setTextureSize(64, 32);
		this.FootBaseac.mirror = true;
		this.setRotation(this.FootBaseac, 0F, 2.356194F, 0F);
		this.FootBasead = new NMTModelRenderer(this, 0, 0);
		this.FootBasead.addBox(-64F, 19F, -2F, 11, 6, 2);
		this.FootBasead.setRotationPoint(0F, 0F, 0F);
		this.FootBasead.setTextureSize(64, 32);
		this.FootBasead.mirror = true;
		this.setRotation(this.FootBasead, 0F, 2.356194F, 0F);
		this.ModuleMain1 = new NMTModelRenderer(this, 0, 0);
		this.ModuleMain1.addBox(-6F, -44F, -16F, 32, 32, 32);
		this.ModuleMain1.setRotationPoint(0F, 0F, 0F);
		this.ModuleMain1.setTextureSize(64, 32);
		this.ModuleMain1.mirror = true;
		this.setRotation(this.ModuleMain1, 0F, 0F, 0F);
		this.ModuleMain2 = new NMTModelRenderer(this, 0, 0);
		this.ModuleMain2.addBox(-16F, -30F, -13F, 32, 16, 26);
		this.ModuleMain2.setRotationPoint(0F, 0F, 0F);
		this.ModuleMain2.setTextureSize(64, 32);
		this.ModuleMain2.mirror = true;
		this.setRotation(this.ModuleMain2, 0F, 0F, 0F);
		this.ModuleMainDeco = new NMTModelRenderer(this, 0, 0);
		this.ModuleMainDeco.addBox(16F, -46F, -21.01F, 5, 30, 37);
		this.ModuleMainDeco.setRotationPoint(0F, 0F, 0F);
		this.ModuleMainDeco.setTextureSize(64, 32);
		this.ModuleMainDeco.mirror = true;
		this.setRotation(this.ModuleMainDeco, 0F, 0F, 0F);
		this.ModuleCore1 = new NMTModelRenderer(this, 0, 0);
		this.ModuleCore1.addBox(-20F, -48F, -25F, 5, 36, 42);
		this.ModuleCore1.setRotationPoint(0F, 0F, 0F);
		this.ModuleCore1.setTextureSize(64, 32);
		this.ModuleCore1.mirror = true;
		this.setRotation(this.ModuleCore1, 0F, 0F, 0F);
		this.ModuleCore2 = new NMTModelRenderer(this, 0, 0);
		this.ModuleCore2.addBox(-30F, -48F, -25F, 5, 36, 42);
		this.ModuleCore2.setRotationPoint(0F, 0F, 0F);
		this.ModuleCore2.setTextureSize(64, 32);
		this.ModuleCore2.mirror = true;
		this.setRotation(this.ModuleCore2, 0F, 0F, 0F);
		this.ModuleCore3 = new NMTModelRenderer(this, 0, 0);
		this.ModuleCore3.addBox(-25F, -44F, -21F, 5, 28, 34);
		this.ModuleCore3.setRotationPoint(0F, 0F, 0F);
		this.ModuleCore3.setTextureSize(64, 32);
		this.ModuleCore3.mirror = true;
		this.setRotation(this.ModuleCore3, 0F, 0F, 0F);
		this.ModuleAux1 = new NMTModelRenderer(this, 0, 0);
		this.ModuleAux1.addBox(26F, -34F, -13F, 4, 16, 26);
		this.ModuleAux1.setRotationPoint(0F, 0F, 0F);
		this.ModuleAux1.setTextureSize(64, 32);
		this.ModuleAux1.mirror = true;
		this.setRotation(this.ModuleAux1, 0F, 0F, 0F);
		this.ModuleAux2 = new NMTModelRenderer(this, 0, 0);
		this.ModuleAux2.addBox(26F, -60F, 9F, 1, 28, 1);
		this.ModuleAux2.setRotationPoint(0F, 0F, 0F);
		this.ModuleAux2.setTextureSize(64, 32);
		this.ModuleAux2.mirror = true;
		this.setRotation(this.ModuleAux2, 0F, 0F, 0F);
		this.ModuleAux3 = new NMTModelRenderer(this, 0, 0);
		this.ModuleAux3.addBox(27F, -57F, -12F, 1, 23, 1);
		this.ModuleAux3.setRotationPoint(0F, 0F, 0F);
		this.ModuleAux3.setTextureSize(64, 32);
		this.ModuleAux3.mirror = true;
		this.setRotation(this.ModuleAux3, 0F, 0F, 0F);
		this.ModuleAux4 = new NMTModelRenderer(this, 0, 0);
		this.ModuleAux4.addBox(28F, -48F, -8F, 1, 14, 1);
		this.ModuleAux4.setRotationPoint(0F, 0F, 0F);
		this.ModuleAux4.setTextureSize(64, 32);
		this.ModuleAux4.mirror = true;
		this.setRotation(this.ModuleAux4, 0F, 0F, 0F);
		this.ModuleAux5 = new NMTModelRenderer(this, 0, 0);
		this.ModuleAux5.addBox(28F, -48F, -6F, 1, 14, 1);
		this.ModuleAux5.setRotationPoint(0F, 0F, 0F);
		this.ModuleAux5.setTextureSize(64, 32);
		this.ModuleAux5.mirror = true;
		this.setRotation(this.ModuleAux5, 0F, 0F, 0F);
		this.ModuleAux6 = new NMTModelRenderer(this, 0, 0);
		this.ModuleAux6.addBox(28F, -48F, -4F, 1, 14, 1);
		this.ModuleAux6.setRotationPoint(0F, 0F, 0F);
		this.ModuleAux6.setTextureSize(64, 32);
		this.ModuleAux6.mirror = true;
		this.setRotation(this.ModuleAux6, 0F, 0F, 0F);
		this.ModuleAux7 = new NMTModelRenderer(this, 0, 0);
		this.ModuleAux7.addBox(27F, -53F, 2F, 1, 19, 1);
		this.ModuleAux7.setRotationPoint(0F, 0F, 0F);
		this.ModuleAux7.setTextureSize(64, 32);
		this.ModuleAux7.mirror = true;
		this.setRotation(this.ModuleAux7, 0F, 0F, 0F);
		this.ModuleAux8 = new NMTModelRenderer(this, 0, 0);
		this.ModuleAux8.addBox(29F, -60F, 9F, 1, 28, 1);
		this.ModuleAux8.setRotationPoint(0F, 0F, 0F);
		this.ModuleAux8.setTextureSize(64, 32);
		this.ModuleAux8.mirror = true;
		this.setRotation(this.ModuleAux8, 0F, 0F, 0F);
		this.ModuleThrusterBase1 = new NMTModelRenderer(this, 0, 0);
		this.ModuleThrusterBase1.addBox(30F, -28F, -5F, 3, 6, 10);
		this.ModuleThrusterBase1.setRotationPoint(0F, 0F, 0F);
		this.ModuleThrusterBase1.setTextureSize(64, 32);
		this.ModuleThrusterBase1.mirror = true;
		this.setRotation(this.ModuleThrusterBase1, 0F, 0F, 0F);
		this.ModuleThrusterBase2 = new NMTModelRenderer(this, 0, 0);
		this.ModuleThrusterBase2.addBox(5F, -39F, -5F, 3, 5, 10);
		this.ModuleThrusterBase2.setRotationPoint(0F, 0F, 0F);
		this.ModuleThrusterBase2.setTextureSize(64, 32);
		this.ModuleThrusterBase2.mirror = true;
		this.setRotation(this.ModuleThrusterBase2, 0F, 0F, 0.7853982F);
		this.ModuleThrusterBase3 = new NMTModelRenderer(this, 0, 0);
		this.ModuleThrusterBase3.addBox(-43F, -4F, -5F, 3, 6, 10);
		this.ModuleThrusterBase3.setRotationPoint(0F, 0F, 0F);
		this.ModuleThrusterBase3.setTextureSize(64, 32);
		this.ModuleThrusterBase3.mirror = true;
		this.setRotation(this.ModuleThrusterBase3, 0F, 0F, 2.356194F);
		this.ModuleThrusterBase4 = new NMTModelRenderer(this, 0, 0);
		this.ModuleThrusterBase4.addBox(24F, -28F, 13.7F, 3, 6, 6);
		this.ModuleThrusterBase4.setRotationPoint(0F, 0F, 0F);
		this.ModuleThrusterBase4.setTextureSize(64, 32);
		this.ModuleThrusterBase4.mirror = true;
		this.setRotation(this.ModuleThrusterBase4, 0F, 0.7853982F, 0F);
		this.ModuleThrusterBase5 = new NMTModelRenderer(this, 0, 0);
		this.ModuleThrusterBase5.addBox(24F, -28F, -19.5F, 3, 6, 6);
		this.ModuleThrusterBase5.setRotationPoint(0F, 0F, 0F);
		this.ModuleThrusterBase5.setTextureSize(64, 32);
		this.ModuleThrusterBase5.mirror = true;
		this.setRotation(this.ModuleThrusterBase5, 0F, -0.7853982F, 0F);
		this.ModuleThrusterConeTop1 = new NMTModelRenderer(this, 0, 0);
		this.ModuleThrusterConeTop1.addBox(-44F, -3F, -1F, 1, 2, 2);
		this.ModuleThrusterConeTop1.setRotationPoint(0F, 0F, 0F);
		this.ModuleThrusterConeTop1.setTextureSize(64, 32);
		this.ModuleThrusterConeTop1.mirror = true;
		this.setRotation(this.ModuleThrusterConeTop1, 0F, 0F, 2.356194F);
		this.ModuleThrusterConeTop2 = new NMTModelRenderer(this, 0, 0);
		this.ModuleThrusterConeTop2.addBox(-45F, -3.5F, -1.5F, 1, 3, 3);
		this.ModuleThrusterConeTop2.setRotationPoint(0F, 0F, 0F);
		this.ModuleThrusterConeTop2.setTextureSize(64, 32);
		this.ModuleThrusterConeTop2.mirror = true;
		this.setRotation(this.ModuleThrusterConeTop2, 0F, 0F, 2.356194F);
		this.ModuleThrusterConeTop3 = new NMTModelRenderer(this, 0, 0);
		this.ModuleThrusterConeTop3.addBox(-46F, -4F, -2F, 1, 4, 4);
		this.ModuleThrusterConeTop3.setRotationPoint(0F, 0F, 0F);
		this.ModuleThrusterConeTop3.setTextureSize(64, 32);
		this.ModuleThrusterConeTop3.mirror = true;
		this.setRotation(this.ModuleThrusterConeTop3, 0F, 0F, 2.356194F);
		this.ModuleThrusterConeBack1 = new NMTModelRenderer(this, 0, 0);
		this.ModuleThrusterConeBack1.addBox(27F, -26F, -18.5F, 1, 2, 2);
		this.ModuleThrusterConeBack1.setRotationPoint(0F, 0F, 0F);
		this.ModuleThrusterConeBack1.setTextureSize(64, 32);
		this.ModuleThrusterConeBack1.mirror = true;
		this.setRotation(this.ModuleThrusterConeBack1, 0F, -0.7853982F, 0F);
		this.ModuleThrusterConeBack2 = new NMTModelRenderer(this, 0, 0);
		this.ModuleThrusterConeBack2.addBox(28F, -26.5F, -19F, 1, 3, 3);
		this.ModuleThrusterConeBack2.setRotationPoint(0F, 0F, 0F);
		this.ModuleThrusterConeBack2.setTextureSize(64, 32);
		this.ModuleThrusterConeBack2.mirror = true;
		this.setRotation(this.ModuleThrusterConeBack2, 0F, -0.7853982F, 0F);
		this.ModuleThrusterConeBack3 = new NMTModelRenderer(this, 0, 0);
		this.ModuleThrusterConeBack3.addBox(29F, -27F, -19.5F, 1, 4, 4);
		this.ModuleThrusterConeBack3.setRotationPoint(0F, 0F, 0F);
		this.ModuleThrusterConeBack3.setTextureSize(64, 32);
		this.ModuleThrusterConeBack3.mirror = true;
		this.setRotation(this.ModuleThrusterConeBack3, 0F, -0.7853982F, 0F);
		this.ModuleThrusterConeBot1 = new NMTModelRenderer(this, 0, 0);
		this.ModuleThrusterConeBot1.addBox(8F, -38F, -1F, 1, 2, 2);
		this.ModuleThrusterConeBot1.setRotationPoint(0F, 0F, 0F);
		this.ModuleThrusterConeBot1.setTextureSize(64, 32);
		this.ModuleThrusterConeBot1.mirror = true;
		this.setRotation(this.ModuleThrusterConeBot1, 0F, 0F, 0.7853982F);
		this.ModuleThrusterConeBot2 = new NMTModelRenderer(this, 0, 0);
		this.ModuleThrusterConeBot2.addBox(9F, -38.5F, -1.5F, 1, 3, 3);
		this.ModuleThrusterConeBot2.setRotationPoint(0F, 0F, 0F);
		this.ModuleThrusterConeBot2.setTextureSize(64, 32);
		this.ModuleThrusterConeBot2.mirror = true;
		this.setRotation(this.ModuleThrusterConeBot2, 0F, 0F, 0.7853982F);
		this.ModuleThrusterConeBot3 = new NMTModelRenderer(this, 0, 0);
		this.ModuleThrusterConeBot3.addBox(10F, -39F, -2F, 1, 4, 4);
		this.ModuleThrusterConeBot3.setRotationPoint(0F, 0F, 0F);
		this.ModuleThrusterConeBot3.setTextureSize(64, 32);
		this.ModuleThrusterConeBot3.mirror = true;
		this.setRotation(this.ModuleThrusterConeBot3, 0F, 0F, 0.7853982F);
		this.ModuleThrusterConeFront1 = new NMTModelRenderer(this, 0, 0);
		this.ModuleThrusterConeFront1.addBox(27F, -26F, 16.5F, 1, 2, 2);
		this.ModuleThrusterConeFront1.setRotationPoint(0F, 0F, 0F);
		this.ModuleThrusterConeFront1.setTextureSize(64, 32);
		this.ModuleThrusterConeFront1.mirror = true;
		this.setRotation(this.ModuleThrusterConeFront1, 0F, 0.7853982F, 0F);
		this.ModuleThrusterConeFront2 = new NMTModelRenderer(this, 0, 0);
		this.ModuleThrusterConeFront2.addBox(28F, -26.5F, 16F, 1, 3, 3);
		this.ModuleThrusterConeFront2.setRotationPoint(0F, 0F, 0F);
		this.ModuleThrusterConeFront2.setTextureSize(64, 32);
		this.ModuleThrusterConeFront2.mirror = true;
		this.setRotation(this.ModuleThrusterConeFront2, 0F, 0.7853982F, 0F);
		this.ModuleThrusterConeFront3 = new NMTModelRenderer(this, 0, 0);
		this.ModuleThrusterConeFront3.addBox(29F, -27F, 15.5F, 1, 4, 4);
		this.ModuleThrusterConeFront3.setRotationPoint(0F, 0F, 0F);
		this.ModuleThrusterConeFront3.setTextureSize(64, 32);
		this.ModuleThrusterConeFront3.mirror = true;
		this.setRotation(this.ModuleThrusterConeFront3, 0F, 0.7853982F, 0F);
  }

    @Override
	public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
    {
        this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0F, 0.6F, 0.0F);
	    this.BodyMain1.render(par7);
	    this.BodyMain2.render(par7);
	    this.BodyAux1.render(par7);
	    this.BodyAux2.render(par7);
	    this.BodyAux3.render(par7);
	    this.BodyAux4.render(par7);
	    this.BodySupportMain1.render(par7);
	    this.BodySupportMain2.render(par7);
	    this.FootBasea.render(par7);
	    this.LegBase1a.render(par7);
	    this.LegStructure1a.render(par7);
	    this.LegStructureAux1a.render(par7);
	    this.FootJointa.render(par7);
	    this.FootBaseb.render(par7);
	    this.LegBase1b.render(par7);
	    this.LegStructureAux1b.render(par7);
	    this.LegStructure1c.render(par7);
	    this.FootJointd.render(par7);
	    this.FootBasee.render(par7);
	    this.FootBasef.render(par7);
	    this.LegBase1h.render(par7);
	    this.LegStructureAux1m.render(par7);
	    this.LegStructure1o.render(par7);
	    this.FootJointp.render(par7);
	    this.FootBaseq.render(par7);
	    this.FootBaser.render(par7);
	    this.LegBase1t.render(par7);
	    this.LegStructureAux1y.render(par7);
	    this.LegStructure1aa.render(par7);
	    this.FootJointab.render(par7);
	    this.FootBaseac.render(par7);
	    this.FootBasead.render(par7);
	    this.ModuleMain1.render(par7);
	    this.ModuleMain2.render(par7);
	    this.ModuleMainDeco.render(par7);
	    this.ModuleCore1.render(par7);
	    this.ModuleCore2.render(par7);
	    this.ModuleCore3.render(par7);
	    this.ModuleAux1.render(par7);
	    this.ModuleAux2.render(par7);
	    this.ModuleAux3.render(par7);
	    this.ModuleAux4.render(par7);
	    this.ModuleAux5.render(par7);
	    this.ModuleAux6.render(par7);
	    this.ModuleAux7.render(par7);
	    this.ModuleAux8.render(par7);
	    this.ModuleThrusterBase1.render(par7);
	    this.ModuleThrusterBase2.render(par7);
	    this.ModuleThrusterBase3.render(par7);
	    this.ModuleThrusterBase4.render(par7);
	    this.ModuleThrusterBase5.render(par7);
	    this.ModuleThrusterConeTop1.render(par7);
	    this.ModuleThrusterConeTop2.render(par7);
	    this.ModuleThrusterConeTop3.render(par7);
	    this.ModuleThrusterConeBack1.render(par7);
	    this.ModuleThrusterConeBack2.render(par7);
	    this.ModuleThrusterConeBack3.render(par7);
	    this.ModuleThrusterConeBot1.render(par7);
	    this.ModuleThrusterConeBot2.render(par7);
	    this.ModuleThrusterConeBot3.render(par7);
	    this.ModuleThrusterConeFront1.render(par7);
	    this.ModuleThrusterConeFront2.render(par7);
	    this.ModuleThrusterConeFront3.render(par7);
//	    LegStructure2b.render(par7);
//	    LegStructure2a.render(par7);
//	    LegStructureAux2a.render(par7);
//	    LegBase2a.render(par7);
//	    LegBase3a.render(par7);
//	    LegStructure3b.render(par7);
//	    LegStructureAux3a.render(par7);
//	    LegBase3b.render(par7);
//	    LegBase2b.render(par7);
//	    LegStructureAux3b.render(par7);
//	    LegStructureAux2b.render(par7);
//	    LegStructure3c.render(par7);
//	    LegBase3g.render(par7);
//	    LegBase2i.render(par7);
//	    LegStructureAux3j.render(par7);
//	    LegStructure2k.render(par7);
//	    LegStructureAux2l.render(par7);
//	    LegStructure3n.render(par7);
//	    LegBase3s.render(par7);
//	    LegBase2u.render(par7);
//	    LegStructureAux3v.render(par7);
//	    LegStructure2w.render(par7);
//	    LegStructureAux2x.render(par7);
//	    LegStructure3z.render(par7);

        GL11.glPopMatrix();
    }

	private void setRotation(NMTModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}