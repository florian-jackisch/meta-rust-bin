
# Recipe for cargo 20250515
# This corresponds to rust release 1.87.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "x86_64-unknown-linux-gnu": "cc2843ffa1915fdd1efe8c6104c41811",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "x86_64-unknown-linux-gnu": "76902b7b786ab483de87e8191b9b329de100360175cd8e0a6e29443189e06368",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2025-05-15/cargo-1.87.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.87.0)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
