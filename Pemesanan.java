 public class Pemesanan {
     // Ahmad Panjalu R5R (202043501452)
     String nama,alamat,tlp,email,ket,penyedia,jasa,bahan,transportasi;
    
    public Pemesanan(String nama,String alamat,String tlp,String email,String ket,
                    String penyedia,String Jasa,String bahan,String transportasi) {
                        
        this.nama = nama;
        this.alamat = alamat;
        this.tlp = tlp;
        this.email = email;
        this.ket = ket;
        this.penyedia = penyedia;
        this.jasa = jasa;
        this.bahan = bahan;
        this.transportasi = transportasi;
        
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getAlamat() {
        return alamat;
    }
    
    public String getTlp() {
        return tlp;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getKet() {
        return ket;
    }
    
    public String getPenyedia() {
        return penyedia;
    }
    
    public String getJasa() {
        return jasa;
    }
    
    public String getBahan() {
        return bahan;
    }
    
    public String getTransportasi() {
        return transportasi;
    }
}

