
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "i586-unknown-linux-gnu": "3470280a5d7c0ceb3642a120b70f5348",
        "x86_64-unknown-linux-gnu": "81e2f2f2a33abdb323512848fd3a19e3",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "i586-unknown-linux-gnu": "b603b42c301ef7cccb96e8975a88259700faf411490fd76f2988c4e67e3d9daf",
        "x86_64-unknown-linux-gnu": "51f5cbd301f055fc00bee171743c4a65500e3988e59483d240499ca5acf0c10d",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "x86_64-unknown-linux-gnu": "966f2401024eefb23fbb607aeb17a3d6",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "x86_64-unknown-linux-gnu": "30284e508ec1536bad12b92c467aeaed78351bf0f3ed9945a0775cfe0a71ef4f",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=11a3899825f4376896e438c8c753f8dc"

require rust-bin-cross.inc
