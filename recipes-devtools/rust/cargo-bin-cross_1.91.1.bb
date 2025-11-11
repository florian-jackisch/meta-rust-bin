
# Recipe for cargo 20251110
# This corresponds to rust release 1.91.1

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "x86_64-unknown-linux-gnu": "336793760fb37500b8b5a8a7fc1243bb",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "x86_64-unknown-linux-gnu": "2e9565bcf38987d585bfeafdb0623a82ef36a3899fcff1c30c9e6b8df1541004",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2025-11-10/cargo-1.91.1-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.91.1)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
