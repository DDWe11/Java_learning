package basic.ch4;

public class Fraction {
    private int mol1, mol2;
    private int denom1, denom2;

    public int getMol1() {
        return mol1;
    }

    public void setMol1(int mol1) {
        this.mol1 = mol1;
    }

    public int getMol2() {
        return mol2;
    }

    public void setMol2(int mol2) {
        this.mol2 = mol2;
    }

    public int getDenom1() {
        return denom1;
    }

    public void setDenom1(int denom1) {
        this.denom1 = denom1;
    }

    public int getDenom2() {
        return denom2;
    }

    public void setDenom2(int denom2) {
        this.denom2 = denom2;
    }

    //求分子分母的最大公约数
    public int gcd(int a, int b) {
        if (a < b) {
            int c = a;
            a = b;
            b = c;
        }
        int r;
        r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }

    public void fAdd() {
        int fm = getDenom1() * getDenom2();
        int fz = getMol1() * getDenom2() + getMol2() * getDenom1();
        int g = gcd(fz, fm);
        fz = fz / g;
        fm = fm / g;
        System.out.println("运算结果为：" + fz + "/" + fm);
    }

    public void fSub() {
        int fm = getDenom1() * getDenom2();
        int fz = getMol1() * getDenom2() - getMol2() * getDenom1();
        if (fz != 0) {
            int g = gcd(fz, fm);
            fz = fz / g;
            fm = fm / g;
            System.out.println("运算结果为：" + fz + "/" + fm);
        } else System.out.println("运算结果为: 0");

    }

    public void fMul() {
        int fz = getMol1() * getMol2();
        int fm = getDenom1() * getDenom2();
        if (fz == fm) {
            System.out.println("运算结果为： 1");
        } else {
            int g = gcd(fz, fm);
            fz = fz / g;
            fm = fm / g;
            System.out.println("运算结果为：" + fz + "/" + fm);
        }
    }

    public void fDiv() {
        int fm = getDenom1() * getMol2();
        int fz = getMol1() * getDenom2();
        if (fz != fm && fm != 0) {
            int g = gcd(fz, fm);
            fz = fz / g;
            fm = fm / g;
            System.out.println("运算结果为：" + fz + "/" + fm);
        }
        else System.out.println("运算结果为：1");
    }
}


